public class Solution {
  public String convert(String s, int numRows) {        
    int strLen = s.length() ;
    if (strLen <= numRows || numRows == 1){
        return s;
    }

    int cycle = 2 * numRows - 2;
    String str = "";

    for (int row = 0; row < numRows; ++row){

        int group = 0;

        int index;
        do {
            index = cycle * group + row;
            str = str + s.charAt(index);
            group = group + 1;

            if (row != 0 && row != numRows - 1){
                index = group * cycle - row;
                if (index < strLen){
                    str = str + s.charAt(index);    
                }
            }
            
            index = group * cycle + row;

        }while (index < strLen);

    }

    return str;

  }
}