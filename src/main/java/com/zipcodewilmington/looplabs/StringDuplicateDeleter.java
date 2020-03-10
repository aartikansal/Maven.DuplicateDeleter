package com.zipcodewilmington.looplabs;
import java.util.Arrays;
/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.

        import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] value = new String[0];
        Integer numberOfOccurance = 0;
        String[] myArray;

        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (array[i].equals(array[j])) {
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] value = new String[0];
        Integer numberOfOccurance = 0;
        String[] myArray;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
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