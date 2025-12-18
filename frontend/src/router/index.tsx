import {createBrowserRouter} from "react-router-dom";
import PageNotFound from "@/pages/PageNotFound.tsx";
import Postal from "@/pages/Postal.tsx";
import OrigenLayout from "@/layouts/origen.tsx";


export const router = createBrowserRouter([

    {
        element:<OrigenLayout/>,
        children:[
            {path: "postal", element: <Postal/>}
        ]
    },

    {path: "*", element: <PageNotFound/>}
]);