///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package colorchooser;
//
//import javax.swing.text.*;
//
///**
// *
// * This class has been unmodified (except to add comments) from the way our
// * professor built this.
// */
//public class RestrictedDocument extends PlainDocument {
//
//    //PDM - string array called charList that determines what is an accepatable character to input in the restricted document.
//    String[] charList;
//
//    public RestrictedDocument(String[] charList) {
//        this.charList = charList;
//    }
//
//    //the validate method.
//    public boolean validate(String exp) {
//        int len = charList.length;
//        for (int i = 0; i < len; i++) {
//            if (exp.equals(charList[i]) && Integer.parseInt(exp) >= 0 && Integer.parseInt(exp) <= 255) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    //Return nothing (reject input) if the string input value is null or if it fails the validation method. Otherwise insert the string.
//    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
//        if (str == null || !validate(str)) {
//            return;
//        }
//        super.insertString(offs, str, a);
//    }
//}
