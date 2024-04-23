package alena.week5_solutions;



    public class String_UniqueCharacters {
        public static void main(String[] args) {
            String str = "AAAABBBBCCCDEFGHHHHHI";

            System.out.println(uniqueCharacter(str));
            System.out.println(uniqueChar(str));

        }

        public static String uniqueCharacter (String str){

            String unique ="";                          // This will store the unique characters

            for (int i = 0; i < str.length(); i++) {    //Outer Loop will iterate through each character of String str
                char ch = str.charAt(i);                    // Retrieving each character of Str and storing it to 'ch' variable

                int charFrequency = 0;                           // store and count the times each character appears
                for (int j = 0; j < str.length() ; j++) {        // Inner Loop : iterate String str AGAIN
                    if (ch == str.charAt(j)){                        // If ch variable character is equal to current character
                        charFrequency++;                                // count it and store to charFrequency
                    }
                }
                if (charFrequency == 1){                        // if charFrequency is only counted once
                    unique += ch;                                       // concatenate it to unique variable coz its unique
                }
            }
            return unique;
        }

        public static String uniqueChar(String str){
            String unique = "";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (str.indexOf(ch) == str.lastIndexOf(ch)){      // If it's the character's first occurence == to last occurance
                    unique += ch;                                       // then its unique
                }
            }
            return unique;
        }
    }
  /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */




