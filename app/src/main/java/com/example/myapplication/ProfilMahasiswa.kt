package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfilMahasiswa() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "PROFIL MAHASISWA",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.size(24.dp)
        )

        // Foto profil
        Box(
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.pas_fotojpeg
                ),
                contentDescription = "Foto Profil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(140.dp)
                    .clip(CircleShape)
            )
        }

        Spacer(
            modifier = Modifier.size(20.dp)
        )

        Text(
            text = "Nazwa Hafidzah",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.size(6.dp)
        )

        Text(
            text = "NIM 245150407111023",
            fontSize = 15.sp
        )

        Spacer(
            modifier = Modifier.size(4.dp)
        )

        Text(
            text = "Program Studi Sistem Informasi",
            fontSize = 15.sp
        )

        Text(
            text = "Fakultas Ilmu Komputer",
            fontSize = 15.sp
        )

        Spacer(
            modifier = Modifier.size(28.dp)
        )

        // Informasi kontak
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFF3F3F3))
                .padding(16.dp)
        ) {

            Column {

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "Nomor Telepon",
                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(
                        modifier = Modifier.width(16.dp)
                    )

                    Column {
                        Text(
                            text = "Nomor Telepon",
                            fontSize = 12.sp
                        )

                        Text(
                            text = "08115924106",
                            fontWeight = FontWeight.Medium
                        )
                    }
                }

                Spacer(
                    modifier = Modifier.size(16.dp)
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Email",
                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(
                        modifier = Modifier.width(16.dp)
                    )

                    Column {
                        Text(
                            text = "Email",
                            fontSize = 12.sp
                        )

                        Text(
                            text = "nazwahafidzah@student.ub.ac.id",
                            fontWeight = FontWeight.Medium
                        )
                    }
                }

                Spacer(
                    modifier = Modifier.size(16.dp)
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        imageVector = Icons.Default.School,
                        contentDescription = "Pendidikan",
                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(
                        modifier = Modifier.width(16.dp)
                    )

                    Column {
                        Text(
                            text = "Pendidikan",
                            fontSize = 12.sp
                        )

                        Text(
                            text = "Universitas Brawijaya",
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }
        }
    }
}