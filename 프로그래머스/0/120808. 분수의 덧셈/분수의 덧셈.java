class Solution {
    // 결과 분수를 기약 분수로 만들기 위한 최대공약수
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = denom1 * denom2 / gcd(denom1, denom2); // 두 분모의 최소공배수
        int newNumer1 = lcm / denom1 * numer1; // 첫 번째 분수의 변환된 새로운 분자
        int newNumer2 = lcm / denom2 * numer2; // 두 번재 분수의 변환된 새로운 분자
        int resultNumer = newNumer1 + newNumer2; // 두 분자의 합 (최종 분자)
        int resultDenom = lcm; // 공통 분모
        // 기약분수 변환
        int gcdResult = gcd(resultNumer, resultDenom);
        resultNumer /= gcdResult;
        resultDenom /= gcdResult;
        return new int[]{resultNumer, resultDenom};
    }
}