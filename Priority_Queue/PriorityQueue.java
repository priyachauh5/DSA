// import java.util.PriorityQueue;
// import java.util.Comparator;
// public class priorityQueue{
//     //when we have to store object
//     static class Student implements Comparable<Student>{//Overriding
//         String name;
//         int rank;

//         public Student(String name, int rank){
//             this.name=name;
//             this.rank=rank;
//         }

//         @Override
//         public int compareTo(Student s2){
//             return this.rank-s2.rank;
//         }
//     }
//     public static void main(String args[]){
//          PriorityQueue<Student> pq=new PriorityQueue<>();

//         // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

//         pq.add("A", 4); //O(logn)
//         pq.add("B", 5);
//         pq.add("C", 2);
//         pq.add("D", 12);
//         while(!pq.isEmpty()){
//             System.out.println(pq.peek()+"->"+pq.peek().rank);
//             // System.out.println(pq.peek()); //O(1)
//             pq.remove(); //O(logn)
//         }
//     }
// }   

import java.util.PriorityQueue;

public class priorityQueue {
    // When we have to store objects
    static class Student implements Comparable<Student> { // Overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }

        // Overriding toString method for better printing
        @Override
        public String toString() {
            return name + " (" + rank + ")";
        }
    }

    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        // Creating and adding Student objects
        pq.add(new Student("A", 4)); // O(log n)
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            Student student = pq.peek(); // O(1)
            System.out.println(student + " -> " + student.rank); 
            pq.remove(); // O(log n)
        }
    }
}
