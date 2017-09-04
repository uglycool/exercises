package Ex_9;

class Util {
    static void execute(String inputString) {
        char[] charrArray = inputString.toCharArray();
        Integer firstEncounter = null;
        Integer maxEncounter = Integer.MIN_VALUE;
        Integer maxlength = Integer.MIN_VALUE;
        for (int i = 0; i < charrArray.length; i++) {

            if (charrArray[i] == '*') {
                if (firstEncounter == null) {
                    firstEncounter = i;
                }
                int maxlengthHolder = 0;
                for (int j = 0; j < charrArray.length - i; j++) {
                    if (charrArray[j + i] == '*') {
                        maxlengthHolder += 1;
                    } else {
                        break;
                    }
                }
                if (maxlengthHolder > maxlength) {
                    maxlength = maxlengthHolder;
                    maxEncounter = i;
                }
            }
        }
        System.out.println("Max length = " + maxlength + "\nPosition of maxLength = " + maxEncounter + 1 + "\nFirst position = " + firstEncounter + 1);


    }
}
