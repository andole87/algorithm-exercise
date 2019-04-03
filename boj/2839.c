#include <stdio.h>
void prime(int n) {
	int i, j, rs, k;
	k = 0;
	int c;
	c = n / 3;
	rs = n - 1;
	for (i = 0; 5 * i <= n; i++) {
		for (j = 0; rs - (5*i) <= n; j++) {
			rs = 5 * i + 3 * j;
			if (rs == n) {
				if (c > i + j) {
					c = i + j;
				}
				k++;
			}
		}
	}
	if (k == 0) {
		printf("-1 \n");
	}
	else {
		printf("%d \n", c);
	}
}

int main() {
	int n;
		scanf("%d", &n);
		prime(n);
}