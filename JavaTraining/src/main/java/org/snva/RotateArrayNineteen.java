package org.snva;

public class RotateArrayNineteen {

    public String[] arrayRotated (int rotation,String[] arrString){
        //https://stackoverflow.com/questions/9580457/fifo-class-in-java

        //char arr[] = {3,1,4,1,5,9,2,6,5,3,5,8,9};
  //      LinkedList<Integer> fifo = new LinkedList<Integer>();
/*

        for (int i = 0; i < arr.length; i++)
            fifo.add (new Integer (arr[i]));

        System.out.print (fifo.removeFirst() + ".");
        while (! fifo.isEmpty())
            System.out.print (fifo.removeFirst());
        System.out.println();
*/

        String[] newArrString = arrString;
        if (rotation<arrString.length) {
            for (int i = 0; i < rotation; i++) {
                newArrString = moveRight(newArrString);
            }
        }
        return (newArrString);

//        String[] newArrStringG = arrString;
//        if (rotation<arrString.length) {
//            for (int i = 0; i < rotation; i++) {
//                newArrStringG = moveRightGeneric(newArrStringG);
//            }
//        }
//        return (newArrStringG);
//


    }


    private String[] moveRight(String[] arr) {
        String[] returnT = new String[arr.length] ;

        returnT[0] = arr[arr.length-1];
//        returnT[arr.length-1] = arr[0];
        for (int i=0;i<arr.length-1;i++){
            returnT[i+1] = arr[i];
        }

        return (returnT);
    }

//    private T[] moveRightGeneric(T[] arr) {
//        T[] returnT = new T[arr.length] ;
//        returnT[0] = arr[arr.length-1];
//        for (int i=1;i<arr.length-1;i++){
//            returnT[i+1] = arr[i];
//        }
//
//        return (returnT);
//    }

}
