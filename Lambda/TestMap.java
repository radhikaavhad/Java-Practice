package Lambda;

import java.util.Arrays;
import java.util.List;

public class TestMap {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8,9};
//        Find square of each num
//        for(int i=0;i<nums.length;i++){
//            nums[i] *= nums[i];
//        }
//
//        for(int num:nums){
//            System.out.println(num);
//        }


        //Find square of each num using map

        List<Integer> listNums = Arrays.asList(nums);
        //used in streamAPI

//        listNums = listNums.stream().map(num->num*num).toList();
//        listNums.forEach(System.out::println);      //most modern for loop used

        int sumOfEvenSquares = listNums.stream()
                .map(num->num*num)      //takes input and gives output
                .filter(num->num%2==0)      //if true keeps , else removes
                .reduce(0,(num1,num2)->num1+num2);
        System.out.println(sumOfEvenSquares);

        int productOfEvenSquares = listNums.stream().map(num->num*num).filter(num->num%2==0).reduce(1,(num1,num2)->num1*num2);
        System.out.println(productOfEvenSquares);
    }
}
