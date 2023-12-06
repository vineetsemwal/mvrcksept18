import { Component } from "react";
import { TableColumns } from "./TableColumns";

export class TableDemo extends Component {

   render() {
      return (
         <table border="1">
            <tbody>
               <tr>
                  <TableColumns />

               </tr>
               <tr>
                  <TableColumns />

               </tr>
               <tr>
                  <TableColumns />

               </tr>
               

            </tbody>
         </table>);
   }

}

