package hash;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P42579 {
    @Test
    void name() {
        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};

        assertArrayEquals(new int[]{4, 1, 3, 0}, solution(genres, plays));
        assertArrayEquals(new int[]{4, 1, 3, 0}, solution2(genres, plays));
    }

    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<Music>> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (map.containsKey(genres[i])) {
                map.get(genres[i]).add(new Music(i, plays[i]));
            } else {
                map.put(genres[i], new ArrayList<>(Arrays.asList(new Music(i, plays[i]))));
            }
        }

        List<Map.Entry<String, List<Music>>> collect = map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue(new Comparator<List<Music>>() {
                    @Override
                    public int compare(List<Music> o1, List<Music> o2) {
                        return o1.stream().mapToInt(Music::getPlays).sum()
                                - o2.stream().mapToInt(Music::getPlays).sum();
                    }
                })))
                .collect(Collectors.toList());

        List<Integer> results = new ArrayList<>();
        for (Map.Entry<String, List<Music>> entry : collect) {
            Collections.sort(entry.getValue());
            if (entry.getValue().size() > 1) {
                results.add(entry.getValue().get(0).getIndex());
                results.add(entry.getValue().get(1).getIndex());
            } else {
                results.add(entry.getValue().get(0).getIndex());
            }
        }
        return results.stream().mapToInt(x -> x).toArray();
    }

    private class Music implements Comparable<Music> {
        private int index;
        private int plays;

        public Music(int index, int plays) {
            this.index = index;
            this.plays = plays;
        }

        public int getIndex() {
            return index;
        }

        public int getPlays() {
            return plays;
        }

        @Override
        public int compareTo(Music o) {
            if (o.plays == this.plays) {
                return this.index - o.index;
            }
            return o.plays - this.plays;
        }
    }

    public int[] solution2(String[] genres, int[] plays) {
        return IntStream.range(0, genres.length)
                .mapToObj(i -> new Music2(i, genres[i], plays[i]))
                .collect(Collectors.groupingBy(Music2::getGenre, Collectors.toList()))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue(Comparator.comparingInt(totalPlaysOfMusics()))))
                .map(entry -> entry.getValue().stream()
                        .sorted()
                        .limit(2)
                        .collect(Collectors.toList()))
                .flatMap(Collection::stream)
                .mapToInt(Music2::getIndex)
                .toArray();
    }

    private ToIntFunction<List<Music2>> totalPlaysOfMusics() {
        return musics -> musics.stream().mapToInt(Music2::getPlays).sum();
    }

    private static class Music2 implements Comparable<Music2> {
        private int index;
        private String genre;
        private int plays;

        Music2(int index, String genre, int plays) {
            this.index = index;
            this.genre = genre;
            this.plays = plays;
        }

        String getGenre() {
            return genre;
        }

        int getIndex() {
            return index;
        }

        int getPlays() {
            return plays;
        }

        @Override
        public int compareTo(Music2 o) {
            if (o.plays == this.plays) {
                return this.index - o.index;
            }
            return o.plays - this.plays;
        }
    }
}
