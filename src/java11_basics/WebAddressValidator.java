package java11_basics;
//Write a program to validate the given web address is a valid one or not according to the following guidelines:
//
//It should start with either http or https
//It should be followed by "://"
//It may have "www."
//The web address should be alphanumeric
//After a "." the domain name should be one among "com", "org", "net"
//
public class WebAddressValidator{
    public boolean isValidWebAddress(String webAddress){
        String emailregex="(http|https)[:][/][/]([w]{3})[.]([a-z0-9]+)[.](com|org|net)";
      return webAddress.matches(emailregex);
    }
}