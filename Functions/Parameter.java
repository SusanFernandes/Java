
class Parameter{
    public static void main(String[] args){
        int num = sumTwoNums(13,2); //when we call the function and in place of parameters we pass arguments here
        System.out.println("Sum is " +num);
    }

    public static int sumTwoNums(int first, int second){// here we pass parameters
        int sum = first + second;
        System.out.println("First num : "+ first);
         System.out.println("Second num : "+ second);
        return sum;   

    }
}