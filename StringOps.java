public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        /**
        //tests for capVowelsLowRest
        String str = "Hello World";
        System.out.println(str);
        System.out.println(capVowelsLowRest(str));

        String str1 = "One two tHRee world";
        System.out.println(str1);
        System.out.println(capVowelsLowRest(str1));

        String str2 = "vowels are fun";
        System.out.println(str2);
        System.out.println(capVowelsLowRest(str2));

        String str3 = "intro";
        System.out.println(str3);
        System.out.println(capVowelsLowRest(str3));

        String str4 = "yellow";
        System.out.println(str4);
        System.out.println(capVowelsLowRest(str4));
        */
        /**
        //tests for camelCase
        String str5 = "Hello World";
        System.out.println(str5);
        System.out.println(camelCase(str5));

        String str6 = "HELLO    world";
        System.out.println(str6);
        System.out.println(camelCase(str6));

        String str7 = " tWo       wordS";
        System.out.println(str7);
        System.out.println(camelCase(str7));

        String str8 = "world";
        System.out.println(str8);
        System.out.println(camelCase(str8));

        String str9 = "     Intro to coMPUter sCIEncE  ";
        System.out.println(str9);
        System.out.println(camelCase(str9));
        */

        String str10 = "Hello world";
        System.out.println(str10);
        int[] arr = (allIndexOf(str10, 'l'));
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        String str11 = "Hello worLd";
        System.out.println(str11);
        int[] arr1 = (allIndexOf(str11, 'l'));
        for(int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        String str12 = "Hello world";
        System.out.println(str12);
        int[] arr2 = (allIndexOf(str12, 'o'));
        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        String str13 = "Hello world";
        System.out.println(str13);
        int[] arr3 = (allIndexOf(str13, ' '));
        for(int i=0; i<arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();

        String str14 = "Hello world";
        System.out.println(str14);
        int[] arr4 = (allIndexOf(str14, 'd'));
        for(int i=0; i<arr4.length; i++) {
            System.out.print(arr4[i] + ", ");
        }
        System.out.println();

        String str15 = "MMMM";
        System.out.println(str15);
        int[] arr5 = (allIndexOf(str15, 'M'));
        for(int i=0; i<arr5.length; i++) {
            System.out.print(arr5[i] + ", ");
        }
        System.out.println();

        
    }

    public static String capVowelsLowRest (String string) {
        String str = "";
        //go over the given string
        for(int i=0; i<string.length(); i++) {
            //if a char is one of the vowels in lower case, change it to upper case and add to the new string
            if(string.charAt(i) == 'a') {
                str+= 'A';
            } else if (string.charAt(i) == 'e') {
                str+= 'E';
            }
            else if(string.charAt(i) == 'i') {
                str+= 'I';
            }
            else if(string.charAt(i) == 'o') {
                str+= 'O';
            }
            else if(string.charAt(i) == 'u') {
                str+= 'U';
            } 
            //if the current char is already a capital vowel, leave it
            else if((string.charAt(i)=='A') || (string.charAt(i)=='E') || (string.charAt(i)=='I') || (string.charAt(i)=='O') || (string.charAt(i)=='U')) {
                str+= string.charAt(i);
            } 
            //any other capital letters, change to lower case
            else if(string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                char c = string.charAt(i);
                str+= (char) (c + 32);
            }
            //any other lower case letters - add to the new string
            else {
                str+= string.charAt(i);
            }    
        }
        return str;
    }

    public static String camelCase (String string) {
        String str = "";
        int j=0;
        int i;
        
        //if the string starts with spaces, increase j until the first different char
        if(string.charAt(0) == 32) {
            while(string.charAt(j) == 32) {
                j++;
            }
        }
        int spaces = j;
        //if there is more than one word
        if(string.indexOf(32) != -1) {
            //count the length of the first word
            while(string.charAt(spaces) != 32) {
                spaces++;
            }
            //go over the given string until the first space
            for(i=j; i < spaces ; i++) {
                //if the first word has caps in it, change them to lower case and add to the new string
                if((string.charAt(i) >= 65) && (string.charAt(i) <= 90)) {
                    char c = string.charAt(i);
                    str+= (char) (c + 32);
                } 
                //if the letter are already lower case, add the to the new string
                else if((string.charAt(i) >= 97) && (string.charAt(i) <= 122)) {
                    str+= string.charAt(i);
                }
            }
            
            //go over the rest of the given string
            for(int k=i; k < string.length(); k++) {
                if(string.charAt(k) != 32) {
                    //change only the first letter to capital
                    if(string.charAt(k-1) == 32) {
                        //if the first letter is capital, add to the new string
                        if((string.charAt(k) >= 65) && (string.charAt(k) <= 90)) {
                            str+= string.charAt(k);
                        } 
                        //if the first letter is lower case, change it to a capital letter add the to the new string
                        else if((string.charAt(k) >= 97) && (string.charAt(k) <= 122)) {
                            char c = string.charAt(k);
                            str+= (char) (c - 32);
                        }
                    }
                    else {
                        //if the next letter is capital, change it to lower case and add to the new string
                        if((string.charAt(k) >= 65) && (string.charAt(k) <= 90)) {
                            char c = string.charAt(k);
                            str+= (char) (c + 32);
                        } 
                        //if the next letter is lower case, add to the new string
                        else if((string.charAt(k) >= 97) && (string.charAt(k) <= 122)) {
                            str+= string.charAt(k);
                        }
                    }
                } 
            } 
        }
        //there is only one word
        else {
            //go over the given string 
            for(i=j; i < string.length(); i++) {
                //if the first word has caps in it, change them to lower case and add to the new string
                if((string.charAt(i) >= 65) && (string.charAt(i) <= 90)) {
                    char c = string.charAt(i);
                    str+= (char) (c + 32);
                } 
                //if the letter are already lower case, add the to the new string
                else if((string.charAt(i) >= 97) && (string.charAt(i) <= 122)) {
                    str+= string.charAt(i);
                }
            }
        }
        return str;
    }
    

    public static int[] allIndexOf (String string, char chr) {
        int letterCount = 0;    //counts how many times the char appears and sets the size of the array
        int index = 0;          //the undex of the cells in the array
        int[] array;
        //go over the string and see how many times the char repeats itself
        for(int i=0; i < string.length(); i++) { 
            if(string.charAt(i) == chr)
                letterCount++;
        }
        //determine the size of the array
        array = new int[letterCount];

        //go over the array and place the indexes of the char
        for(int j=0; j < string.length(); j++) {
            if(string.charAt(j) == chr) {
                array[index] = j;
                index++;
            }
        }
        return array;
    }
}
