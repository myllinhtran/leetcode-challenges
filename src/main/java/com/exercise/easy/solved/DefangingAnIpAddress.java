package com.exercise.easy.solved;

public class DefangingAnIpAddress {

    public static void main(String[] args) {
        String address = "1.1.1.1";
        String output = new DefangingAnIpAddress().defangIPaddr(address);
        System.out.println(output);
    }

    public String defangIPaddr(String address) {
        StringBuilder newIpAddress = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                newIpAddress.append(address.charAt(i));
            }
            else {
                newIpAddress.append('[');
                newIpAddress.append(address.charAt(i));
                newIpAddress.append(']');
            }
        }
        return String.valueOf(newIpAddress);
    }
}
