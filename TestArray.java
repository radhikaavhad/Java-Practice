public class TestArray {
    public static void main(String[] args) { //(String[] args is called command line arguments)
    
        int nums[] = {1,2,3,4,5};

        for(int i = 0;i<nums.length;i++) //standard for loop
        System.out.println(nums[i]);

        for(int num : nums)             //enhanced for loop
        System.out.println(nums);
}
}

