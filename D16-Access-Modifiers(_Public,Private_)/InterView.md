


#                                             Access Modifiers
#               Access modifiers determine the visibility rules whether other classes can access a variable
#               or invoke a method.
#               At class level, you can either use public modifier or no modifier.
#               For class members, you can use one of the following access modifiers.
#               private - External classes cannot access the member.
#               protected - Only sub-classes can access the member.
#               public - All classes in the application can access the member.
#               no modifier - All classes within the package can access this member.
#               The access modifier in the overriding methods should be same or less restrictive than the
#               overridden method.
#               Optional static and final keywords are frequently used along with the access modifiers.








Questions
What is the purpose of access modifier?
Is there any difference between the list of access modifiers available for a class and
for its members?
What is the scope of private, protected and pubic access modifiers?
What happens when no access modifier is specified with the class?
If sub-class exists in a different package, does it still has visibility to the protected
members of the super-class?
Why should the member access modifier in the derived class be less restrictive than
the base?
As per inheritance concept, you should be able to use sub class object with
super class reference. This will not be possible if sub class member is declared
with more restrictive access modifier.
What should be the criteria to decide an access modifier for a class?
You should use the most restrictive access modifier to ensure security and to
prevent any misuse