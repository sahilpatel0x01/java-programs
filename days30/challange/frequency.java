package days30.challange;

class Frequency {

    public void dupCounter(int[] arr) {

        boolean[] counted = new boolean[arr.length];
       

        for (int i = 0; i < arr.length; i++) {

            if (counted[i]) {
                continue;
                 //if already counted then skip 
                 //because index i== j, so declared index j's value to be true if count++ condition
                 // ran alteast once.so next time counted[i ] where the value previoously was i==j 
                 //got skipped.
                
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    counted[j] = true;
                }
            }

            System.out.println(arr[i] + " | " + count);
        }
    }
}