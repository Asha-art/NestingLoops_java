public class NestingLoopsAssignment {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        for (int n = 1; n <= 3; n++) {

            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c + " " + n);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
            }
            // * You will add a line of code here.
            System.out.println();

        }

        System.out.println("\n");

    }
}

// Answers
// 1. Its the innerloop n that changes faster because for every c value n
// iterates till 3 and then goes out of loop and c increments and iterates

// 2. Output will be, first every n values, c executes and increments till 'E'
// and then n increments and executes.
// 3. the output prints in next line for every iteration
// 4. Here with System.out.println(); is in after closing inner loop but inside
// outer loop,output will be printed in next line after every 3 iteration (once
// innerloops ends its iteration)
