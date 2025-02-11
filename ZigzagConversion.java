public class ZigzagConversion {

        public String convert(String s, int numRows) {
            if (numRows == 1 || s.length() <= numRows) {
                return s;
            }
    
            StringBuilder[] rows = new StringBuilder[numRows];
            for (int i = 0; i < numRows; i++) {
                rows[i] = new StringBuilder();
            }
    
            int i = 0;
            int direction = -1;  // Used to toggle between up and down
            for (char c : s.toCharArray()) {
                rows[i].append(c);
                
                // Change direction when reaching top or bottom row
                if (i == 0 || i == numRows - 1) {
                    direction *= -1;
                }
    
                i += direction;
            }
    
            // Combine all rows
            StringBuilder result = new StringBuilder();
            for (StringBuilder row : rows) {
                result.append(row);
            }
    
            return result.toString();
        }
    
        public static void main(String[] args) {
            ZigzagConversion ZigzagConversion = new ZigzagConversion();
            System.out.println(ZigzagConversion.convert("PAYPALISHIRING", 3)); // Output: "PAHNAPLSIIGYIR"
        }
    
    
}
