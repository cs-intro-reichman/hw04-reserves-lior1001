public class ArrayOps {
    public static void main(String[] args) {
       
       /** //tests for findMissingInt
        int[] array = {3, 0, 1};
        for (int i=0; i<3; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        System.out.println(findMissingInt(array));

        int[] array1 = {0};
        for (int i=0; i<1; i++)
            System.out.print(array1[i] + " ");
        System.out.println();
        System.out.println(findMissingInt(array1));

        int[] array2 = {0, 1, 2, 3, 4, 6};
        for (int i=0; i<6; i++)
            System.out.print(array2[i] + " ");
        System.out.println();
        System.out.println(findMissingInt(array2));
        */
        //tests for secondMaxValue
        int arr[] = {6, 9, 4, 7, 3, 4};
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println(secondMaxValue(arr));

        int arr1[] = {1, 2, 3, 4, 5};
        for (int i=0; i<arr1.length; i++)
            System.out.print(arr1[i] + " ");
        System.out.println();
        System.out.println(secondMaxValue(arr1));

        int arr2[] = {2, 8, 3, 7, 8};
        for (int i=0; i<arr2.length; i++)
            System.out.print(arr2[i] + " ");
        System.out.println();
        System.out.println(secondMaxValue(arr2));

        int arr3[] =  {1, -2, 3, -4, 5};
        for (int i=0; i<arr3.length; i++)
            System.out.print(arr3[i] + " ");
        System.out.println();
        System.out.println(secondMaxValue(arr3));

        int arr4[] =  {-202, 48, 13, 7, 8};
        for (int i=0; i<arr4.length; i++)
            System.out.print(arr4[i] + " ");
        System.out.println();
        System.out.println(secondMaxValue(arr4));
        
        /** 
        //tests for containsTheSameElements
        int arr1[] = {1, 2, 1, 1, 2};
        int arr2[] = {2, 1};
        for(int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println(containsTheSameElements(arr1, arr2));

        int arr3[] = {2, 2, 3, 7, 8, 3, 2};
        int arr4[] = {8, 2, 7, 7, 3};
        for(int i=0; i<arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        for(int i=0; i<arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
        System.out.println();
        System.out.println(containsTheSameElements(arr3, arr4));

        int arr5[] = {1, 2, 3};
        int arr6[] = {1, 2, 3};
        for(int i=0; i<arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }
        System.out.println();
        for(int i=0; i<arr6.length; i++) {
            System.out.print(arr6[i] + " ");
        }
        System.out.println();
        System.out.println(containsTheSameElements(arr5, arr6));

        int arr7[] = {3, -4, 1, 2, 5};
        int arr8[] = {1, 3, -4, 5};
        for(int i=0; i<arr7.length; i++) {
            System.out.print(arr7[i] + " ");
        }
        System.out.println();
        for(int i=0; i<arr8.length; i++) {
            System.out.print(arr8[i] + " ");
        }
        System.out.println();
        System.out.println(containsTheSameElements(arr7, arr8));
        

        //tests for isSorted
        int arr9[] = {7, 5, 4, 3, -12};
        for (int i=0; i<arr9.length; i++)
            System.out.print(arr9[i] + " ");
        System.out.println();
        System.out.println(isSorted(arr9));

        int arr10[] = {1, 2, 3};
        for (int i=0; i<arr10.length; i++)
            System.out.print(arr10[i] + " ");
        System.out.println();
        System.out.println(isSorted(arr10));

        int arr11[] = {1, -2, 3};
        for (int i=0; i<arr11.length; i++)
            System.out.print(arr11[i] + " ");
        System.out.println();
        System.out.println(isSorted(arr11));

        int arr12[] = {1, 1, 500};
        for (int i=0; i<arr12.length; i++)
            System.out.print(arr12[i] + " ");
        System.out.println();
        System.out.println(isSorted(arr12));

        int arr13[] = {1, 3, 2};
        for (int i=0; i<arr13.length; i++)
            System.out.print(arr13[i] + " ");
        System.out.println();
        System.out.println(isSorted(arr13));
        */
    }
    
    public static int findMissingInt (int [] array) {
        int missingInt = 0;
        //create a new array that stores all the digits that are in the given array
        int[] count = new int[array.length + 1];
        //go over the given array
        for (int i=0; i<array.length; i++) {
            int num = array[i];
            count[num]++;
        }
        //go over the count array and check what digit is missing
        for(int j=0; j<count.length; j++) {
            if(count[j] == 0)
                missingInt = j;
        }
        return missingInt;
    }

    public static int secondMaxValue(int [] array) {
        //presume that the max value and the secondMax value is in the first cell of the array
        int secMax = array[0];
        int max = array[0];
        //to indicate if the max value appears more than once
        int flag = 0; 
        //go over the array and find the max value
        for (int i=0; i<array.length; i++) {
            //if the cell has the same value as the max, increase the flag value
            if(array[i] == max) {
                flag++;
            }
            if(array[i] >= max) {
            max = array[i];
            }      
        }
        //go over the array again and check what cell is greater than secMax and lower than max
        for (int j=0; j < array.length; j++) {
            if(secMax <= array[j] && array[j] < max) {
                secMax = array[j];
            }
        }
        //if flag is greater than 2 (it will always be at least 1 because of the first value of max), then the max appeared more than once
        //in ths case, set secMax to the max value
        if(flag >= 2) {
            secMax = max;
        }
        return secMax;
    }

    public static boolean containsTheSameElements(int [] array1, int [] array2) {
        //create a boolean variable to check if the arrays have the same element
        boolean same = false;  
        //in case there is an element that does not appear in both arrays, count it  
        int notSame = 0;
        //go over one of the arrays
        for(int i=0; i<array1.length; i++) {
            //for every value in the array, reset the boolean to false
            same = false;
            //go over the other array
            for(int j=0; j<array2.length; j++) {
                //if there is a match between the values, the boolean is true
                if(array1[i] == array2[j]) {
                    same = true;
                }
            }
            //if there wasn't a match and the boolean variable remained false, count it
            if(same == false)
                notSame++;
        }
        //if the notSame counter is greater than 0, it means there is at least one variable that doesn't appear in both arrays
        return (notSame == 0);
    }

    public static boolean isSorted(int [] array) {
        boolean dec = decreasingArray(array);
        boolean inc = increasingArray(array);
        return (inc || dec);
    }

    private static boolean decreasingArray (int[] array) {
        boolean isDec = false;
        int count = 0;
        for(int i=0; i<array.length-1; i++) {
            if(array[i] >= array[i+1]) {
                isDec = true; }
            else {
                isDec = false; }
                
            if(isDec == false) {
                count++;
            }
        }
        return (count == 0);
    }

    private static boolean increasingArray (int[] array) {
        boolean isDec = false;
        int count = 0;
        for(int i=0; i<array.length-1; i++) {
            if(array[i] <= array[i+1]) {
                isDec = true; }
            else {
                isDec = false; }
            if(isDec == false) {
                count++;
            }
        }
        return (count == 0);
    }

}
