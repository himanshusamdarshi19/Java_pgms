Import java.util.*; 
Public class Set example 
{ 
Public static void main (String [] args) 
{ 

// Set demonstration using Hash Set 
Set<String> hash Set = new Hash Set<String> (); 
hash_Set.add ("srinivas"); 
hash_Set.add ("shoba"); 
hash_Set.add ("srithan"); 
hash_Set.add ("krithik"); 
hash_Set.add ("shoba"); 
System.out.println ("Set output without the duplicates"); 
System.out.println (hash Set); 
// Set demonstration using Tree Set 
System.out.println ("Sorted Set after passing into Tree Set"); 
Set<String> tree Set = new Tree Set<String> (hash Set); 
System.out.println (tree Set); 
} 
} 


