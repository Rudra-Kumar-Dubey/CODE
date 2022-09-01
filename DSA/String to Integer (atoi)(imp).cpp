class Solution {
public:
    int myAtoi(string s) {
	
		//String to store the filtered string
        string temp = "";
        long long num = 0;
        int i = 0;
		
		// This loop will filter the string and remove all unnecessary characters from it 
        while (i < s.length()) {
		
			// Remove all starting spaces
            while (s[i] == ' ') {
                i++;
            }
			// if any other non numatic value comes after arithmatic operator then the number is invalid
            if ((s[i] == '+' || s[i] == '-') && !(s[i + 1] >= '0' && s[i + 1] <= '9'))
                return num;

			// This loop only allows the initial arithmetic operators and number
            while ((s[i] >= '0' && s[i] <= '9') || (s[i] == '+' || s[i] == '-')) {
			
				// If any operator occurred between the number then terminate the filtered string
                if ((s[i] == '+' || s[i] == '-') && temp.length() >= 1)
                    break;
					
                temp.push_back(s[i]);
                i++;
            }
            break;
        }
		
		// Set a flag for negative number
		// Remove the initial arithmetic operators from the filtered string
        int neg = 0;
        if (temp[0] == '-') {
            neg = 1;
            temp.erase(temp.begin());
        }
        else if (temp[0] == '+')
            temp.erase(temp.begin());
			
        i = 0;
		// Now remove all initial zeros from the filtered string which does not have any value
        while (temp[i] == '0')    {
            i++;
        }
        
        temp.erase(0, i);
        long long power = 1;
        int digit;
		
		// Convert the filtered string into a number
        for (int i = temp.length() - 1; i >= 0; i--)    {
            if (temp[i] >= '0' && temp[i] <= '9')   {
			
				//Convert the ASCII code into the integer
                digit = temp[i] - '0';
				
				// Add unit imter with its decimal place power
                num += (digit * power);
                
                if ((num > INT_MAX) || (power > INT_MAX))   {
					// If the number is less than the lower limit of signed int then print INT_MIN
                    if (neg)
                        return INT_MIN;
					// If the number is greater than the upper limit of signed int then print INT_MAX 
                    else
                        return INT_MAX;
                }
				// multiply power by 10 from the next place 
                power *= 10;
            }
        }
		// If the number is negative then print negative number 
        if (neg)
            num -= num * 2;
        return num;
    }
};