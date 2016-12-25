/**
 * Created by jvishal on 12/25/16.
 */

public class RightTriangle {
        private int size;

        public RightTriangle(int n) {
            size =n;
        }

        public String displayRightTriangle() {

            StringBuilder righttriangle = new StringBuilder();

            for(int i=1; i<= size; i++ )
            {
                buildRightTriangle(righttriangle,i);

                if (i!=size) righttriangle.append("\n");
            }

            return righttriangle.toString();
        }

        private void buildRightTriangle(StringBuilder righttriangle, int i)   // have split the above method following Object calistheincs
        {
            for(int j=1; j<=i; j++)
            {
                righttriangle.append("*");
            }

        }

    public static void main(String[] args) {
        System.out.println(new RightTriangle(10).displayRightTriangle());
    }

    }


