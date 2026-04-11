package days30.challange;

class Frequency {

    public void dupCounter(int[] arr) {

        boolean[] counted = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (counted[i]) {
                continue;
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