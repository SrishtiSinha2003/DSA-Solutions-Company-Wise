public class DefangingAnIPaddress {
    public String defangIPaddr(String address) {
        // Replace all occurrences of '.' with '[.]'
        return address.replace(".", "[.]");

        // second solution using StringBuilder
        // StringBuilder sb = new StringBuilder();
        // for (char c : address.toCharArray()) {
        //     if (c == '.') {
        //         sb.append("[.]");
        //     } else {
        //         sb.append(c);
        //     }
        // }
        // return sb.toString();
    }
    public static void main(String[] args) {
        DefangingAnIPaddress solution = new DefangingAnIPaddress();
        String address = "192.168.1.1";
        String defanged = solution.defangIPaddr(address);
        System.out.println(defanged);
        }
    }
