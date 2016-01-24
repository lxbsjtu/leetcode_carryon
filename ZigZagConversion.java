package Banker;

/**
 * Created by lxb on 16/1/22.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int col = s.length();
        char[][] mat = new char[numRows][col];
        char[] s1 = s.toCharArray();
        char[] res = new char[s.length()];
        boolean colFlag = false;
        int index_s = 0;
        int colFlag2 = 0;
        for(int i = 0; i < numRows; ++i){
            for(int j = 0; j < col; ++j){
                mat[i][j] = '#';
            }

        }
        for(int j = 0; j < col && index_s < s1.length; ++j){
            colFlag2 = j;
            for(int i = 0; i < numRows && !colFlag && index_s < s1.length; ++i){
                mat[i][j] = s1[index_s++];
            }
            for(int i = numRows - 2; i > 0 && colFlag && index_s < s1.length; --i){
                mat[i][j] = s1[index_s++];
            }
            colFlag = !colFlag;
        }

        int index = 0;
        for(int i = 0; i < numRows && index < s.length(); ++i){
            for(int j = 0; j <= colFlag2 && index < s.length(); ++j ){
                if(mat[i][j] != '#'){
                    res[index] = mat[i][j];
                    index++;
                }
            }
        }
        return String.valueOf(res);
    }
}
