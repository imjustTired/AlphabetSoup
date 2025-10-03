public class Soup {
//Name: Rodwell Alfred
//Date: 09/29/25
//Description: This program will manage a string of letters for a company, allowing you to add letters, insert the company name, remove vowels and many other things.

    
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    // Precondition: 'company' should not be null
    // Postcondition: The company name is updated
    public void setCompany(String company){
        this.company = company;
}

    
    // Precondition: Company name has already been set
    // Postcondition: Returns the current company name
    public String getCompany(){
        return company;
}

    // Precondition: letters already has a value
    // Postcondition: Returns the letters string
    public String getLetters(){
        return letters;
}


    // Precondition: 'word' should not be null
    // Postcondition: 'word' is added to the end of letters
    public void add(String word){ // Precondition: letters and company already have values
    // Postcondition: letters now has company name in the middle, updated string is returned
        letters += word;
}

    // Precondition: letters is not empty
    // Postcondition: Returns a random character from letters
    public char randomLetter(){
        int noodle = (int)(Math.random() * letters.length());
        return letters.charAt(noodle);
}

    
   
    public String companyCentered(){
        String ramen = letters.substring(0, letters.length()/2);
        String ramen3 = letters.substring(letters.length()/2, letters.length());
        String bigramen = ramen + company + ramen3;
        letters = bigramen;
        System.out.println(letters);
        return letters;
}

    // Precondition: letters already has a value
    // Postcondition: First vowel is removed, or letters stays the same if none found
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[AEIOUaeiou]", "");
}


    // Precondition: num is between 0 and letters.length()
    // Postcondition: 'num' letters are removed from a random position in letters
    public void removeSome(int num){
        int sp = (int)(Math.random() * (letters.length() - num));
        letters = letters.substring(0, sp) + letters.substring(sp + num);
        System.out.println(letters);
}

    // Precondition: word should not be null
    // Postcondition: All copies of word are removed from letters
    public void removeWord(String word){
        letters = letters.replaceAll(word,"");
}

    }