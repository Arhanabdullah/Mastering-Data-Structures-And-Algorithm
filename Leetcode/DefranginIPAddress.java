package Leetcode;

public class DefranginIPAddress {
    //1108. Defanging an IP Address
    //Time Complexity: O(n) where n is the length of the address
    //Space Complexity: O(n) where n is the length of the address
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

}
