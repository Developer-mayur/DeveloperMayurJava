#                            StringBuilder vs StringBuffer
#                                 Similarities
#        Both StringBuilder and StringBuffer objects are mutable, so both allows String values
#        to change.
#        Object of both the classes are created and stored in heap.
#        Similar methods are available on both the classes.
#        Differences
#        StringBuffer methods are synchronized, so its thread safe whereas StringBuilder is
#        not.
#        Performance of StringBuilder is significantly better than StringBuffer, as
#        StringBuilder does not has any synchronization overheads.
#        Note: If you need to share String objects between threads then use StringBuffer, otherwise
#        StringBuilder.








Questions
What are the similarities and differences between StringBuffer and StringBuilder?
When would you prefer StringBuffer to StringBuilder?
Between StringBuffer and StringBuilder, which one would you prefer in a singlethreaded application?


#                                           Unicode
#        Unicode is international standard character encoding system, which represents most of the
#        written languages in the world. Before Unicode, there were multiple encoding systems
#        prevalent: ASCII, KOI8, ISO 8859, etc., each encoding system has its own code values
#        and character set with different lengths. So to solve this issue, a uniform standard is
#        created, which is known as Unicode. Unicode provides platform and language
#        independent unique number for each character.


Questions
What are Unicode characters?
What are the advantages of using Unicode characters?
What were the problems with old encoding systems?