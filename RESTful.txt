        🔹 HTTP (Stateless)
               │
               ▼
   ❗ Problem: Server forgets who you are after every request
               │
               ▼
        🍪 Cookies invented
      (Browser stores small data)
               │
               ▼
      🗂️ Sessions introduced
  (Server keeps user info; browser holds Session ID in cookie)
               │
               ▼
     🔑 Session ID identifies which
       session belongs to which user
               │
               ▼
   🚪 Authentication + Authorization formalized
   (AuthN = Who are you? | AuthZ = What can you do?)
               │
               ▼
  🌐 Problem: Sessions don’t scale well for large systems / APIs
               │
               ▼
       🔸 Tokens introduced
   (Client keeps proof of identity — no server memory)
               │
               ▼
        🧱 JWT (JSON Web Token)
   → A standardized, secure token format
   → Encodes user data + signature
               │
               ▼
    ✅ Modern Auth Systems
    (OAuth2, OpenID Connect, API tokens, etc.)
