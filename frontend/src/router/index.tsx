import {createBrowserRouter} from "react-router-dom";
import PageNotFound from "@/pages/PageNotFound.tsx";
//import AltaPersona from "@/pages/AltaPersona";


export const router = createBrowserRouter([
    {path: "*", element: <PageNotFound/>},
    //{path: "/altapersona", element: <AltaPersona/>},
]);