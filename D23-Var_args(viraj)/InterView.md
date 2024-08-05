#                            varargs vs object array
#            varargs parameters allows zero or more arguments to be passed to the method; whereas,
#            an object array parameter cannot be called with zero arguments.
#            varargs
#            public static int getCumulativeValue(int… values){
#            int sum = 0;
#            for(int value : values){
#            sum += value;
#            }
#            return sum;
#            }
#            object array
#            public static int getCumulativeValues(int[] values){
#            int sum = 0;
#            for(int value : values){
#            sum += value;
#            }
#            return sum;
#            }


#    varargs can only be the last parameter in the method; whereas, an object array can be
#     defined in any order.
#     Both varargs and object array are handled as array within a method.
#     Though varargs are not very popular, but it can be used in any place where you have
#     to deal with indeterminate number of arguments.



Questions
What is varargs?
What are the differences between varargs and object array?
Can you call a method with zero arguments, which is defined with a varargs as its
only parameter?
Can you overload a method that takes an int array, to take an int varargs?
What are the different scenarios where you can use varargs?
