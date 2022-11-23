using System;
using System.Collections.Generic;
using System.Text;

namespace SP_Lab.Interfaces
{
    public interface IElement<T>
    {
        public void Add(T t);
        public void Remove(T t);
        public void Get(T t);

        public void Print();
    }
}
