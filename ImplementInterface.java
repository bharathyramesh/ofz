package com.ofs.training;

public class ImplementInterface implements CharSequence {

    private String name;

    // void returnString() {
    //
    // name.length();
    // }

    ImplementInterface(String name) {
        this.name = name;
    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        char[] charName = name.toCharArray();
        int count = 0;
        for (char ch : charName) {
            count++;
        }
        charAt(count);
        return count;
    }

    @Override
    public char charAt(int index) {

        char[] charName = name.toCharArray();
        for (int i = 0; i < index; i++) {
            System.out.print(charName[i]);
        }
        // TODO Auto-generated method stub
        System.out.println();
        subSequence(0, index - 1);
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        // TODO Auto-generated method stub
        char[] charName = name.toCharArray();
        char[] ch = new char[10];
        for (int i = start; i < end; i++) {
            ch[i] = charName[i];
            System.out.print(ch[i]);
        }
        System.out.println();
        CharSequence sequence = new String(ch);
        toString();
        return null;
    }

//    @Override 
//    public String toString() {
//        char[] charName = name.toCharArray();
//        System.out.println(charName);
//        return null;
//    }
    @Override
    public String toString() {
        StringBuffer name = new StringBuffer("hari");
        System.out.println(name.reverse());
        return null;
    }

    public static void main(String[] args) {

        ImplementInterface inter = new ImplementInterface("hari");
        System.out.println(inter.length());
    }

}
