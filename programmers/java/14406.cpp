#include <vector>

using namespace std;

long long sum_of_primes(int n)
{
    // 에라토스테네스의 체 그림설명 : https://upload.wikimedia.org/wikipedia/commons/b/b9/Sieve_of_Eratosthenes_animation.gif
    
	if (n == 2) return 2;
    
    // 에라토스테네스의 체 시작
    
    // PirmeArray는 소수인지 아닌지 판별하는 용도.
    // PrimeArray[숫자]가 true이면 숫자가 소수가 되고, PrimeArray[숫자]가 false이면 소수가 아니다.
    // PrimeArray[0]은 사용하지 않는다.
    
	bool* PrimeArray = new bool[n + 1]; // 0을 사용 안하니까 하나 더 필요하다.
	long long answer = 0;

	for (int i = 2; i <= n; i++) // PrimeArray 초기화. 처음에는 모두 소수라고 가정한다.
		PrimeArray[i] = true;

	for (int i = 2; i <= n; i++)
	{
        // 작은 수에서부터 시작해서, 소수인것이 나온다면 그것의 배수는 모두 소수가 아니다.
        // 예를들어 7은 소수이다.(처음에 true로 해놨으니까) 14, 21, 28 ... 은 소수가 아니다.
        // 루프가 진행하면서 14,21,28...를 만나면 false이므로 소수가 아닌것을 알게 된다.
        
		if (PrimeArray[i]) { //처음 만나는 소수일때
            //////// **체를 거르면서 바로 answer에 합산. 이렇게 안하면 효율성 떨어짐.** ////////
			answer += i; 
            
            // 해당 소수의 배수는 모두 소수가 아니다. 배수들을 모두 false로 바꿈. i*2, i*3, i*4....n
			for (int j = i * 2; j <= n; j += i) 
				PrimeArray[j] = false;
		}
	}
    // 에라토스테네스의 체 끝.

	return answer;
}

long long solution(int N) {
    //벡터고 자시고 필요없다.
	long long answer = 0;

	answer = sum_of_primes(N);
	return answer;
}
