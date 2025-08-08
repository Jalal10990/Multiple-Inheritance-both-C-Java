#include<iostream>
using namespace std;

class Employee{
    public:
    void work(){
        cout<<"Employee is working."<<endl;

    }

};

class Student{
    public:
    void study(){
        cout<<"Student is studying."<<endl;
    }
};

class Intern : public Employee, public Student{
    public:
    void info(){
        cout<<"I am an intern."<<endl;
    }
};
int main(){
    Intern i;
    i.work();
    i.study();
    i.info();

    return 0;
}

