package com.example.toolbarmenu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Se usa un Toolbar propio en lugar del ActionBar por defecto del tema.
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.title = "Mi Aplicación"
        setSupportActionBar(toolbar)

        // Botón de navegación superior (hamburguesa / back)
        toolbar.setNavigationOnClickListener {
            Toast.makeText(this, "Menú lateral desplegado", Toast.LENGTH_SHORT).show()
            // Aquí se podría abrir un DrawerLayout, si existiera, con:
            // drawerLayout.openDrawer(GravityCompat.START)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Se carga el menú desde el recurso XML res/menu/menu_toolbar.xml
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_perfil -> {
                Toast.makeText(this, "Opción seleccionada: Perfil", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_configuracion -> {
                Toast.makeText(this, "Opción seleccionada: Configuración", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_salir -> {
                Toast.makeText(this, "Opción seleccionada: Salir", Toast.LENGTH_SHORT).show()
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
