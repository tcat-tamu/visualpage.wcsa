package edu.tamu.tcat.visualpage.wcsa;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import edu.tamu.tcat.visualpage.wcsa.docstrum.Docstrum;

public class Application implements IApplication
{

   @Override
   public Object start(IApplicationContext context) throws Exception
   {

      try 
      {
         Docstrum docstrum = new Docstrum();
         docstrum.execute();
//         SimpleWCSATest test = new SimpleWCSATest();
//         test.execute();
         return IApplication.EXIT_OK;
      } 
      catch (Exception ex)
      {
         ex.printStackTrace();
         return IApplication.EXIT_OK;
      }
   }

   

   @Override
   public void stop()
   {
      // TODO Auto-generated method stub
   }

}
