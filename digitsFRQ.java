public Digits(int num)

{

digitList = new ArrayList<Integer>();

if (num == 0)

{

digitList.add(new Integer(0));

}

while (num > 0);

{

digitList.add(0, newInteger(num%10);

//puts the digit that was cut off at the beginning of the ArrayList, or else it would be in reverse order

num /= 10;

}
}
