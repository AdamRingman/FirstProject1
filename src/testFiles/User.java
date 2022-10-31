package testFiles;

public class User {
    private String username;
    private String password;
    private String userType;

    public User(String uName, String pWord, String uType) {
        username = uName;
        password = pWord;
        userType = uType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void changeUsername(String newUsername) {
        if (newUsername.length() >= 4) {
            username = newUsername;
        }
    }

    public void changePassword(String newPassword) {
        Boolean specialSymbol = false;
        Boolean lowerCase = false;
        Boolean upperCase = false;

        for (int i = 0; i < newPassword.length(); i++) {
            int c = newPassword.charAt(i);
            System.out.println(c);

            if (c <= 122 && c >= 97) {
                lowerCase = true;
            } else if (c >= 65 && c <= 90) {
                upperCase = true;
            }

        }

        if (newPassword.contains("!")) {
            specialSymbol = true;
        } else if (newPassword.contains("$")) {
            specialSymbol = true;
        } else if (newPassword.contains("#")) {
            specialSymbol = true;
        } else if (newPassword.contains("&")) {
            specialSymbol = true;
        }

        if (newPassword.length() >= 7 && newPassword.length() <= 20 && specialSymbol == true && lowerCase == true && upperCase == true) {
            password = newPassword;
        }
    }

    public void changeTypeOfUser(String typeOfUser) {
        if (typeOfUser.equals("normal") || typeOfUser.equals("admin") || typeOfUser.equals("super")) {
            userType = typeOfUser;
        }
    }

    public String getTypeOfUser() {
        return userType;
    }
}
