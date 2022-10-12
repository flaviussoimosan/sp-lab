using System;
using System.Collections.Generic;
using System.Text;

namespace SP_Lab.Classes
{
    public class Image
    {
        public string ImageName { get; set; }

        public Image(string newIamgeName)
        {
            ImageName = newIamgeName;
        }

        public void Print()
        {
            Console.WriteLine("Image : " + ImageName);
        }
    }
}
