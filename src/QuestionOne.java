import java.util.Arrays;
import java.util.OptionalInt;

public class QuestionOne {

    public static void main(String[] args) {
        int[] givenArr = new int[]{1, 5, 7, 4, 1, 2};
        int[] arrA1 = new int[]{1, 2, 3};
        int[] arrA2 = new int[]{-1, -3};

        OptionalInt firstAnswer = getSmallestPositiveInteger(givenArr, arrA1);
        OptionalInt secondAnswer = getSmallestPositiveInteger(givenArr, arrA2);

        if (firstAnswer.isPresent()) System.out.println(firstAnswer.getAsInt());
        if (secondAnswer.isPresent()) System.out.println(secondAnswer.getAsInt());
    }

    public static OptionalInt getSmallestPositiveInteger(int[] numbers, int[] arrayA) {

        return Arrays.stream(numbers)
                .distinct()
                .filter((number) -> Arrays.stream(arrayA).noneMatch(x -> x == number ))
                .min();
    }
}
