class Test {
static int i = 1;
public static void main(String[] args) {
int i = 1;
for (Test.i = 1; Test.i<10; Test.i++) {
i = i + 2;
System.out.print(i + " ");
} } }