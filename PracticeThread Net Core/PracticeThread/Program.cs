using System;
using System.Threading.Tasks;

namespace PracticeThread
{
    class Program
    {
        static void Main(string[] args)
        {
            Functions func = new Functions();
            string stringTask;
            bool backgroundTaskFinished = false;

            Task.Run(async () => {

                stringTask = await func.PrintNumbers();
                Console.WriteLine(stringTask);

            }).ContinueWith(cont => {
                
                Console.WriteLine("Ahora si!, Por fin terminé");
                backgroundTaskFinished = true;

            });

            Console.WriteLine("Ejecutando tarea principal");


            while (!backgroundTaskFinished)
                Console.WriteLine("Oh state!! aun no acabo");

            Console.ReadLine();
        }
    }
}
