#include <vector>

using namespace std;

long long sum_of_primes(int n)
{
    // �����佺�׳׽��� ü �׸����� : https://upload.wikimedia.org/wikipedia/commons/b/b9/Sieve_of_Eratosthenes_animation.gif
    
	if (n == 2) return 2;
    
    // �����佺�׳׽��� ü ����
    
    // PirmeArray�� �Ҽ����� �ƴ��� �Ǻ��ϴ� �뵵.
    // PrimeArray[����]�� true�̸� ���ڰ� �Ҽ��� �ǰ�, PrimeArray[����]�� false�̸� �Ҽ��� �ƴϴ�.
    // PrimeArray[0]�� ������� �ʴ´�.
    
	bool* PrimeArray = new bool[n + 1]; // 0�� ��� ���ϴϱ� �ϳ� �� �ʿ��ϴ�.
	long long answer = 0;

	for (int i = 2; i <= n; i++) // PrimeArray �ʱ�ȭ. ó������ ��� �Ҽ���� �����Ѵ�.
		PrimeArray[i] = true;

	for (int i = 2; i <= n; i++)
	{
        // ���� ���������� �����ؼ�, �Ҽ��ΰ��� ���´ٸ� �װ��� ����� ��� �Ҽ��� �ƴϴ�.
        // ������� 7�� �Ҽ��̴�.(ó���� true�� �س����ϱ�) 14, 21, 28 ... �� �Ҽ��� �ƴϴ�.
        // ������ �����ϸ鼭 14,21,28...�� ������ false�̹Ƿ� �Ҽ��� �ƴѰ��� �˰� �ȴ�.
        
		if (PrimeArray[i]) { //ó�� ������ �Ҽ��϶�
            //////// **ü�� �Ÿ��鼭 �ٷ� answer�� �ջ�. �̷��� ���ϸ� ȿ���� ������.** ////////
			answer += i; 
            
            // �ش� �Ҽ��� ����� ��� �Ҽ��� �ƴϴ�. ������� ��� false�� �ٲ�. i*2, i*3, i*4....n
			for (int j = i * 2; j <= n; j += i) 
				PrimeArray[j] = false;
		}
	}
    // �����佺�׳׽��� ü ��.

	return answer;
}

long long solution(int N) {
    //���Ͱ� �ڽð� �ʿ����.
	long long answer = 0;

	answer = sum_of_primes(N);
	return answer;
}
