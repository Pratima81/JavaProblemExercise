public class QPrimeNumberCount{

    public static void main(String[] args) {
        System.out.println(primeCount(20, 30));
        
    }

    private static int primeCount(int start, int end) {
        int primeCount =0;

        for(int i = start; i <= end; i++ ){
            boolean isPrime = true;
        //check if i is primenumber
            if(i > 1){              
                for(int j = 2; j <= i/2 ;j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime){
                    primeCount++;
                }
            }
        }


        return primeCount;
    }
}


QUESTION: Given a range [L, R], we need to find the count of total numbers of prime numbers in the range [L, R] where 0 <= L <= R < 10000. 
  Consider that there are a large number of queries for different ranges.
