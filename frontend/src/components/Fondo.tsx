export default function Fondo(){
    return (
        <>
        <div className="fixed inset-0 -z-10">
        <div className="absolute inset-0 bg-[radial-gradient(1000px_700px_at_15%_10%,rgba(239,68,68,.25),transparent_60%),radial-gradient(900px_700px_at_85%_15%,rgba(255,255,255,.12),transparent_55%),linear-gradient(to_bottom,#020617,#0b1220)]"></div>
        <div className="absolute inset-0 opacity-50 bg-[radial-gradient(circle_at_20%_30%,rgba(255,255,255,.10)_0_2px,transparent_3px),radial-gradient(circle_at_60%_20%,rgba(255,255,255,.08)_0_2px,transparent_3px),radial-gradient(circle_at_80%_40%,rgba(255,255,255,.06)_0_2px,transparent_3px)] bg-[length:280px_280px]"></div>
        </div>
        </>
    )
}