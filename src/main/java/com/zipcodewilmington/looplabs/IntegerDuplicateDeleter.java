package com.zipcodewilmington.looplabs;
        import java.lang.reflect.Array;
        import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {

        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] value = new Integer[0];
        Integer numberOfOccurance = 0;
        Integer[] myArray;

        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (array[i] == array[j]) {
                    numberOfOccurance++;
                }

            }
            if (numberOfOccurance < maxNumberOfDuplications) {


                myArray = Arrays.copyOf(value, value.length + 1);
                myArray[myArray.length - 1] = array[i];

                value = myArray;


            }
            numberOfOccurance = 0;
        }

        return value;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] value = new Integer[0];
        Integer numberOfOccurance = 0;
        Integer[] myArray;

        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (array[i] == array[j]) {
                    numberOfOccurance++;
                }

            }
            if (numberOfOccurance != exactNumberOfDuplications) {


                myArray = Arrays.copyOf(value, value.length + 1);
                myArray[myArray.length - 1] = array[i];

                value = myArray;


            }
            numberOfOccurance = 0;
        }


        return value;
    }
}