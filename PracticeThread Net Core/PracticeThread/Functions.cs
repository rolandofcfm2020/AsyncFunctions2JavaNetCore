using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;

namespace PracticeThread
{
    public class Functions
    {

        public async Task<string> PrintNumbers()
        {

            try
            {

                Console.WriteLine("Proceso de PrintNumbers iniciando");
                for (int i = 0; i < 100; i++)
                {
                    Console.WriteLine(i);
                }
            }
            catch (Exception ex)
            {

            }

            return await Task.FromResult("Tarea PrintNumbers finished");
        }
    }
}
