class Solution {
public:
    bool strongPasswordCheckerII(string str) 
	{
        int count=0;
        int lower=0;
        int upper=0;
        int digit=0;
        int sp_char=0;
        
        int idx=0;
        while(idx < str.length())
        {
        	if(str[idx]>='a' and str[idx]<='z')
        	lower++;
        	else if(str[idx]>='A' and str[idx]<='Z')
        	upper++;
        	else if(str[idx]>='0' and str[idx]<='9')
        	digit++;
        	else 
        	sp_char++;
        	
        	if((idx)<str.length() and (idx+1)<str.length())
        	{
        		if(str[idx] == str[idx+1])
        		{
       			   cout<<"a"<<endl;
        		   return false;	
				}
			}
			
			count++;
			idx++;
		}
		if(count < 8)
		{
		   cout<<"b"<<endl;
		   return false;	
		}
		
		if(lower <= 0)
		{
			cout<<"c"<<endl;
		   return false;	
		}
		
		if(upper <= 0)
		{
			cout<<"d"<<endl;
		   return false;	
		}
		
		if(digit <= 0)
		{
			cout<<"e"<<endl;
		   return false;	
		}
		
		if(sp_char <= 0)
		{
			cout<<"f"<<endl;
		   return false;	
		}
		
		return true;
    }
};
