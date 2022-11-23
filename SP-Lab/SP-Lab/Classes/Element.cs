using System;
using System.Collections.Generic;
using System.Text;
using SP_Lab.Interfaces;

namespace SP_Lab.Classes
{
    public class Element <T> : IElement<T>
    {
        public void Add(T t)
        {
            throw new NotImplementedException();
        }

        public void Get(T t)
        {
            return;
        }

        public void Print()
        {
            throw new NotImplementedException();
        }

        public void Remove(T t)
        {
            throw new NotImplementedException();
        }
    }
}
