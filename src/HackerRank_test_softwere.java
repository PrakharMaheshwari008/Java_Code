public class HackerRank_test_softwere {
    public static void main(String[] args) {
        String s="eight eight eight triple eight eight eight eight eight eight eight eight";
        System.out.println(getPhoneNumber(s));
        }
    public static String getPhoneNumber(String s) {
        StringBuilder str = phone_num(s);
        String singleString = str.toString();
        return singleString;
    }
        public static StringBuilder phone_num(String s) {
            String arr[] = s.split("[ ]+");
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i].equals("one"))) {
                    temp.append("1");
                }
                if ((arr[i].equals("zero"))) {
                    temp.append("0");
                } else if (arr[i].equals("two")) {
                    temp.append("2");
                } else if (arr[i].equals("three")) {
                    temp.append("3");
                } else if (arr[i].equals("four")) {
                    temp.append("4");
                } else if (arr[i].equals("five")) {
                    temp.append("5");
                } else if (arr[i].equals("six")) {
                    temp.append("6");
                } else if (arr[i].equals("seven")) {
                    temp.append("7");
                } else if (arr[i].equals("eight")) {
                    temp.append("8");
                } else if (arr[i].equals("nine")) {
                    temp.append("9");
                }
                if (arr[i].equals("double")) {
                    if ((arr[i + 1].equals("one"))) {
                        temp.append("1");
                        temp.append("1");
                        i++;
                    } else if (arr[i + 1].equals("two")) {
                        temp.append("2");
                        temp.append("2");
                        i++;
                    } else if (arr[i + 1].equals("three")) {
                        temp.append("3");
                        temp.append("3");
                        i++;
                    } else if (arr[i + 1].equals("four")) {
                        temp.append("4");
                        temp.append("4");
                        i++;
                    } else if (arr[i + 1].equals("five")) {
                        temp.append("5");
                        temp.append("5");
                        i++;
                    } else if (arr[i + 1].equals("six")) {
                        temp.append("6");
                        temp.append("6");
                        i++;
                    } else if (arr[i + 1].equals("seven")) {
                        temp.append("7");
                        temp.append("7");
                        i++;
                    } else if (arr[i + 1].equals("eight")) {
                        temp.append("8");
                        temp.append("8");
                        i++;
                    } else if (arr[i + 1].equals("nine")) {
                        temp.append("9");
                        temp.append("9");
                        i++;
                    }
                }
                if (arr[i].equals("triple")) {
                    if ((arr[i + 1].equals("one"))) {
                        temp.append("1");
                        temp.append("1");
                        temp.append("1");
                        i++;
                    } else if (arr[i + 1].equals("two")) {
                        temp.append("2");
                        temp.append("2");
                        temp.append("2");
                        i++;
                    } else if (arr[i + 1].equals("three")) {
                        temp.append("3");
                        temp.append("3");
                        temp.append("3");
                        i++;
                    } else if (arr[i + 1].equals("four")) {
                        temp.append("4");
                        temp.append("4");
                        temp.append("4");
                        i++;
                    } else if (arr[i + 1].equals("five")) {
                        temp.append("5");
                        temp.append("5");
                        temp.append("5");
                        i++;
                    } else if (arr[i + 1].equals("six")) {
                        temp.append("6");
                        temp.append("6");
                        temp.append("6");
                        i++;
                    } else if (arr[i + 1].equals("seven")) {
                        temp.append("7");
                        temp.append("7");
                        temp.append("7");
                        i++;
                    } else if (arr[i + 1].equals("eight")) {
                        temp.append("8");
                        temp.append("8");
                        temp.append("8");
                        i++;
                    } else if (arr[i + 1].equals("nine")) {
                        temp.append("9");
                        temp.append("9");
                        temp.append("9");
                        i++;
                    }
                }
            }
            return new StringBuilder(temp.toString());
        }
    }
